package oit.is.z0570.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {

  /**
   * lec02というGETリクエストがあったら，lec02()を呼び出して，index.htmlを返すメソッド
   *
   * @return
   */
  @GetMapping("/lec02")
  public String lec02() {
    return "lec02.html";
  }

  /**
   * POSTを受け付ける場合は@PostMappingを利用する /sample25へのpostを受け付けて，FormParamで指定された変数(input
   * name)をsample25()メソッドの引数として受け取ることができる
   *
   * @param kakeru1
   * @param kakeru2
   * @param model
   * @return
   */
  @PostMapping("/lec02")
  public String lec02(@RequestParam String username, ModelMap model) {
    model.addAttribute("username", username);
    return "lec02.html";
  }

}
