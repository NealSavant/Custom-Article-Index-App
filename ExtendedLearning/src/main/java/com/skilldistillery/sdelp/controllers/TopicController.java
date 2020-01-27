package com.skilldistillery.sdelp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.sdelp.data.TopicDAO;
import com.skilldistillery.sdelp.data.TopicDAOJpaImpl;
import com.skilldistillery.sdelp.entities.Topic;

@Controller
public class TopicController {
	
	@Autowired
	TopicDAO topicdao = new TopicDAOJpaImpl();
	
	@RequestMapping(path="showTopicList.do")
	public String showTopicList(@RequestParam int cid, Model model) {
		Topic topic = topicdao.getTopicById(cid);
		model.addAttribute("topic", topic);
		return "topic";
	}
	
	@RequestMapping(path="showAllTopics.do")
	public String showAllTopics(Model model) {
		List<Topic> topics = topicdao.getAllTopics();
		model.addAttribute("topics", topics);
		return "allTopics";
	}
	
	@RequestMapping(path="showTopicsBySearch.do")
	public String showTopicsBySearch(@RequestParam String keyword, Model model) {
		List<Topic> topics = topicdao.findTopicsBySearchTerm(keyword);
		model.addAttribute("keyword", keyword);
		model.addAttribute("topics", topics);
		return "keywordTopics";
	}

}