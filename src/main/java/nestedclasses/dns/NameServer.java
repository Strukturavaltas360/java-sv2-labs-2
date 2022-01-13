package nestedclasses.dns;

import java.util.LinkedList;
import java.util.List;

public class NameServer {
    private static class DnsEntry {
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }

    private List<DnsEntry> entries = new LinkedList<>();

    private interface Filter {
        boolean test(DnsEntry entry);
    }

    public void addEntry(String hostName, String hostIp) {
        if (hostName == null || hostIp == null || hostName.isBlank() || hostIp.isBlank()) {
            throw new IllegalArgumentException(String.format("Invalid hostName(%s) or hostIp(%s)", hostName, hostIp));
        }
        if (findEntry(new Filter() {
            @Override
            public boolean test(DnsEntry entry) {
                return entry.hostName.equals(hostName) || entry.hostIp.equals(hostIp);
            }
        }) != null) {
            throw new IllegalArgumentException("Already exists");
        }
        entries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String hostName) {
        DnsEntry result = findEntry(new Filter() {
            @Override
            public boolean test(DnsEntry entry) {
                return entry.hostName.equals(hostName);
            }
        });
        if (result != null) {
            entries.remove(result);
        }
    }

    public void removeEntryByIp(String hostIp) {
        DnsEntry result = findEntry(new Filter() {
            @Override
            public boolean test(DnsEntry entry) {
                return entry.hostIp.equals(hostIp);
            }
        });
        if (result != null) {
            entries.remove(result);
        }
    }

    public String getIpByName(String hostName) {
        DnsEntry result = findEntry(new Filter() {
            @Override
            public boolean test(DnsEntry entry) {
                return entry.hostName.equals(hostName);
            }
        });
        if (result == null) {
            throw new IllegalArgumentException("Element not found");
        }
        return result.hostIp;
    }

    public String getNameByIp(String hostIp) {
        DnsEntry result = findEntry(new Filter() {
            @Override
            public boolean test(DnsEntry entry) {
                return entry.hostIp.equals(hostIp);
            }
        });
        if (result == null) {
            throw new IllegalArgumentException("Element not found");
        }
        return result.hostName;
    }

    public List<DnsEntry> getEntries() {
        return entries;
    }

    private DnsEntry findEntry(Filter filter) {
        for (DnsEntry entry: entries) {
            if (filter.test(entry)) {
                return entry;
            }
        }
        return null;
    }
}
