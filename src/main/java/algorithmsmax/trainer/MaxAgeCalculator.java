package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer withMaxAge = null;
        for (Trainer trainer: trainers) {
            if (withMaxAge == null || trainer.getAge() > withMaxAge.getAge()) {
                withMaxAge = trainer;
            }
        }
        return withMaxAge;
    }
}
