package com.etc.employment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.etc.employment.entity.User;
import com.etc.employment.service.EmployeeManager;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/getAll", method = RequestMethod.POST)
	@ResponseBody
	public String getAllEmployees(Model model, String username, String password) {

		System.out.println("username: " + username + ",password: " + password);

		// System.out.println(request.getParameter("username"));
		// System.out.println(request.getParameter("password"));
		//
		// System.out.println(user.getUsername());
		// System.out.println(user.getPassword());

		model.addAttribute("employees", manager.getAllEmployees());

		return "employeesListDisplay";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin(Model model) {
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
	}

	@RequestMapping(value = "/getUserJson", method = RequestMethod.POST)
	@ResponseBody
	public String getUserJson(User user) {

		System.out.println(user.getUname());
		System.out.println(user.getUpassword());

		JSONArray array = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("username", user.getUname());
		array.add(json);
		System.out.println(array.toString());
		return array.toString();
	}

	/**
	 * ajax请求不需要返回页面，只需要得到response中的数据即可，所以方法签名为void即可
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/getListMap", method = RequestMethod.POST)
	public void getUserListMap(HttpServletRequest request,
			HttpServletResponse response) {
		String jsonResult = getJSONString(request);
		renderData(response, jsonResult);
	}

	private String getJSONString(HttpServletRequest request) {
		// 故意构造一个数组，使返回的数据为json数组，数据更复杂些
		List<Map<String, Object>> datas = new ArrayList<Map<String, Object>>(5);
		Map<String, Object> map1 = new HashMap<String, Object>(10);
		// 可以获得ajax请求中的参数
		map1.put("a", request.getParameter("a"));
		map1.put("b", request.getParameter("b"));
		map1.put("c", request.getParameter("c"));
		datas.add(map1);
		// 故意构造一个数组，使返回的数据为json数组，数据更复杂些
		Map<String, Object> map2 = new HashMap<String, Object>(10);
		map2.put("a", "11");
		map2.put("b", "22");
		map2.put("c", "33");
		datas.add(map2);
		String jsonResult = JSON.toJSONString(datas);
		return jsonResult;
	}

	/**
	 * 通过PrintWriter将响应数据写入response，ajax可以接受到这个数据
	 * 
	 * @param response
	 * @param data
	 */
	private void renderData(HttpServletResponse response, String data) {
		PrintWriter printWriter = null;
		try {
			printWriter = response.getWriter();
			printWriter.print(data);
		} catch (IOException ex) {
			Logger.getLogger(EmployeeController.class.getName()).log(
					Level.SEVERE, null, ex);
		} finally {
			if (null != printWriter) {
				printWriter.flush();
				printWriter.close();
			}
		}
	}

	@RequestMapping(value = "/getUserMap", method = RequestMethod.POST)
	@ResponseBody
	public void getUserMap(HttpServletRequest request,
			HttpServletResponse response) {

		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setUname("ysj");
		user.setUpassword("2307");
		list.add(user);

		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("total", "1");
		modelMap.put("data", list);
		modelMap.put("success", "true");
		String jsonResult = JSON.toJSONString(modelMap);
		renderData(response, jsonResult);

	}

}