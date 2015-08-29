package lt.roadrulestest.test.questions;

import org.springframework.data.repository.Repository;

public interface QuestionRepository extends Repository<Question, Long> {
	Question save(Question q);
}
