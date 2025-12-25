package persian.googolplexian.metamath.MainFragments.Currency.ItemsList;

public class Class_Cur_Item {

    private int CUR_Item_ID;
    private String CUR_Item_Title;
    private String CUR_Item_Vector;

    public Class_Cur_Item(int CUR_Item_ID, String CUR_Item_Title, String CUR_Item_Vector) {
        this.CUR_Item_ID = CUR_Item_ID;
        this.CUR_Item_Title = CUR_Item_Title;
        this.CUR_Item_Vector = CUR_Item_Vector;
    }

    public int getCUR_Item_ID() {
        return CUR_Item_ID;
    }

    public void setCUR_Item_ID(int CUR_Item_ID) {
        this.CUR_Item_ID = CUR_Item_ID;
    }

    public String getCUR_Item_Title() {
        return CUR_Item_Title;
    }

    public void setCUR_Item_Title(String CUR_Item_Title) {
        this.CUR_Item_Title = CUR_Item_Title;
    }

    public String getCUR_Item_Vector() {
        return CUR_Item_Vector;
    }

    public void setCUR_Item_Vector(String CUR_Item_Vector) {
        this.CUR_Item_Vector = CUR_Item_Vector;
    }
}
