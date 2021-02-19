package course.topics;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepo topicRepo;
			
	
	
	public List<Topic> getAlltopics() {
		List <Topic> topics =new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
  	}

	public Object getTopic(String id ) {
		return topicRepo.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		topicRepo.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepo.deleteById(id);
		
	}
}
