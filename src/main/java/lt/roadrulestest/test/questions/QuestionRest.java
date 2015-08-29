package lt.roadrulestest.test.questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionRest {
	
	@Autowired
	QuestionRepository qr;
	
	@RequestMapping(value = "/try", method = RequestMethod.GET)
	@ResponseBody
	public Question enterQuestion() {
		Question q;
		q = new Question("Test question");
		
		return qr.save(q);
	}
}
