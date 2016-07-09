package com.etc.employment.controller;

import com.alibaba.fastjson.JSON;
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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author xbs
 */
@Controller
@RequestMapping("hello")
public class TextController {

  /**
   * ajax请求不需要返回页面，只需要得到response中的数据即可，所以方法签名为void即可
   * 
   * @param request
   * @param response 
   */
  @RequestMapping(value = "ajax", method = RequestMethod.POST)
  public void ajaxDatas(HttpServletRequest request, HttpServletResponse response) {
    String jsonResult = getJSONString(request);
    renderData(response, jsonResult);
  }

  private String getJSONString(HttpServletRequest request) {
    //故意构造一个数组，使返回的数据为json数组，数据更复杂些
    List<Map<String, Object>> datas = new ArrayList<Map<String, Object>>(5);
    System.out.println("ssssss");
    Map<String, Object> map1 = new HashMap<String, Object>(10);
    //可以获得ajax请求中的参数
    map1.put("a", request.getParameter("a"));
    map1.put("b", request.getParameter("b"));
    map1.put("c", request.getParameter("c"));
    datas.add(map1);
    //故意构造一个数组，使返回的数据为json数组，数据更复杂些
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
      Logger.getLogger(TextController.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      if (null != printWriter) {
        printWriter.flush();
        printWriter.close();
      }
    }
  }
}