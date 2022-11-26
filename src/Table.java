public class Table {
  private  int tableNum;
    private  boolean isTableFree;


    public  int getTableNum() {
        return tableNum;
    }

    public  void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public boolean isTableFree() {
        return isTableFree;
    }

    public void setTableFree(boolean tableFree) {
        isTableFree = tableFree;
    }

    public Table(int tableNum, boolean isTableFree) {
        this.tableNum = tableNum;
        this.isTableFree = isTableFree;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNum=" + this.tableNum +
                ", isTableFree=" + this.isTableFree +
                '}';

    }
}
