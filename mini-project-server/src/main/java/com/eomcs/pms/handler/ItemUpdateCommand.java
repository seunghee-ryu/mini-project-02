package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Item;
import com.eomcs.util.Prompt;

public class ItemUpdateCommand implements Command {

  List<Item> itemList;

  public ItemUpdateCommand(List<Item> list) {
    this.itemList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[아이템 변경]");
      int no = Prompt.inputInt("번호? ", out, in);
      Item item = findByNo(no);

      if (item == null) {
        out.println("해당 번호의 아이템이 없습니다.");
        return;
      }

      String name = Prompt.inputString(
          String.format("이름(%s)? ", item.getName()), out, in);
      String location = Prompt.inputString(
          String.format("발견 장소(%s)? ", item.getLocation()), out, in);

      String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("아이템 변경을 취소하였습니다.");
        return;
      }

      item.setName(name);
      item.setLocation(location);
      out.println("아이템을 변경하였습니다.");
      out.println("'/move/hallway' 명령어를 이용해 복도로 이동합니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }

  private Item findByNo(int no) {
    for (int i = 0; i < itemList.size(); i++) {
      Item item = itemList.get(i);
      if (item.getNo() == no) {
        return item;
      }
    }
    return null;
  }
}
