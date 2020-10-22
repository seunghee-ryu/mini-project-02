package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Item;
import com.eomcs.util.Prompt;

//detail
public class ItemDetailCommand implements Command {

  List<Item> itemList;

  public ItemDetailCommand(List<Item> list) {
    this.itemList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[아이템 상세보기]");
      int no = Prompt.inputInt("번호? ", out, in);
      Item item = findByNo(no);

      if (item == null) {
        out.println("해당 번호의 아이템이 없습니다.");
        return;
      }

      out.printf("번호: %s\n", item.getNo());
      out.printf("아이템 이름: %s\n", item.getName());
      out.printf("발견 장소: %s\n", item.getLocation());
      out.printf("아이템 내용: %s\n", item.getContent());


    } catch (Exception e) {
      out.printf("아이템 상세 보기 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }

  private Item findByNo(int no) {
    for (int i = 0; i < itemList.size(); i++) {
      Item item= itemList.get(i);
      if (item.getNo() == no) {
        return item;
      }
    }
    return null;
  }
}
