package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {
    private enum FilterAction {
        GET_FIRST, GET_ALL, REMOVE_ALL
    }

    private interface Filter {
        boolean test(OnlineLesson lesson);
    }

    private List<OnlineLesson> lessons = new ArrayList<>();

    public void addNewLesson(OnlineLesson lesson) {
        List<OnlineLesson> next = findLesson(FilterAction.GET_FIRST, new Filter() {
            @Override
            public boolean test(OnlineLesson actual) {
                return actual.getStartTime().isAfter(lesson.getStartTime());
            }
        });
        if (!next.isEmpty()) {
            lessons.add(lessons.indexOf(next.get(0)), lesson);
        } else {
            lessons.add(lesson);
        }
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        return findLesson(FilterAction.GET_ALL, new Filter() {
            @Override
            public boolean test(OnlineLesson lesson) {
                return lesson.getTitle().equals(title);
            }
        });
    }

    public void removeLesson(LocalDateTime startTime) {
        findLesson(FilterAction.REMOVE_ALL, new Filter() {
            @Override
            public boolean test(OnlineLesson lesson) {
                return lesson.getStartTime().isEqual(startTime);
            }
        });
    }

    private List<OnlineLesson> findLesson(FilterAction action, Filter filter) {
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while(iterator.hasNext() && (result.isEmpty() || action != FilterAction.GET_FIRST)) {
            OnlineLesson actual = iterator.next();
            if (filter.test(actual)) {
                switch(action) {
                    case GET_FIRST:
                    case GET_ALL:
                        result.add(actual);
                        break;
                    case REMOVE_ALL:
                        iterator.remove();
                        break;
                }
            }
        }
        return result;
    }

    public List<OnlineLesson> getLessons() {
        return lessons;
    }
}
