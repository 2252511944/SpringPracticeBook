package sia.knights;

/**
 * 骑士类
 */
public class BraveKnight implements Knight {

  private Quest quest;

  // Quest接口被注入进来
  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    System.out.println("***BraveKnight embarkOnQuest***");
    quest.embark();
  }

}
