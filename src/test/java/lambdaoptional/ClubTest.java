package lambdaoptional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {
    Member member1 = new Member("member1", List.of("skill1", "skill2"), Gender.WOMAN);
    Member member2 = new Member("member2", List.of("skill3"), Gender.MAN);
    Member member3 = new Member("member3", List.of("skill1", "skill4"), Gender.WOMAN);
    Member member4 = new Member("member4", List.of("skill4"), Gender.MAN);
    Club club = new Club(List.of(member1, member2, member3, member4));

    @Test
    void findFirstFoundTest() {
        Optional<Member> result = club.findFirst(member -> member.getSkills().contains("skill4"));
        assertTrue(result.isPresent());
        assertEquals(member3, result.get());
    }

    @Test
    void findFirstNotFoundTest() {
        Optional<Member> result = club.findFirst(member -> member.getName().equals("member"));
        assertTrue(result.isEmpty());
    }

    @Test
    void averageNumberOfSkillsValidTest() {
        Optional<Double> result = club.averageNumberOfSkills();
        assertTrue(result.isPresent());
        assertEquals(1.5, result.get(), 0.01);
    }

    @Test
    void averageNumberOfSkillsInValidTest() {
        Club emptyClub = new Club(List.of());
        Optional<Double> result = emptyClub.averageNumberOfSkills();
        assertTrue(result.isEmpty());
    }
}