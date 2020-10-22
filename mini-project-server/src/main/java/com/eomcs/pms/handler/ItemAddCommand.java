package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Item;
import com.eomcs.util.Prompt;

public class ItemAddCommand implements Command {

  List<Item> itemList;

  public ItemAddCommand(List<Item> list) {
    this.itemList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[아이템 등록]");

      Item item = new Item();
      item.setNo(Prompt.inputInt("번호? ", out, in));
      item.setName(Prompt.inputString("아이템 이름? ", out, in));
      item.setLocation(Prompt.inputString("발견 장소? ", out, in));
      item.setContent(Prompt.inputString("내용? ", out, in));
      itemList.add(item);

      out.println("아이템을 등록하였습니다.");
      out.println("'/move/hallway' 명령어를 이용해 복도로 이동합니다.");

    } catch(Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}
