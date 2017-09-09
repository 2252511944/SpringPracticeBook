package sia.knights;

/*
这个类表达的思想不就是和我一开始想要表达的思想是一致的吗？直接注入接口的实现类而不是接口
 */
public class DamselRescuingKnight implements Knight {

  private RescueDamselQuest quest;

  public DamselRescuingKnight() {
    // 与RescueDamselQuest紧耦合,new对象的时候会调用它的构造函数,与类中具体的代码产生了联系
    this.quest = new RescueDamselQuest();
  }

  public void embarkOnQuest() {
      System.out.println("***DamselRescuingKnight embarkOnQuest***");
    quest.embark();
  }

}
