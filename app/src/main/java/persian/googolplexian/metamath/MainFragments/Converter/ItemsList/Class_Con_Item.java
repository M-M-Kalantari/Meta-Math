package persian.googolplexian.metamath.MainFragments.Converter.ItemsList;

public class Class_Con_Item {

    private int CON_Item_ID;
    private String CON_Item_Title;
    private String CON_Item_Vector;

    public Class_Con_Item(int converterItem_ID, String converterItem_Title, String converterItem_Vector) {
        CON_Item_ID = converterItem_ID;
        CON_Item_Title = converterItem_Title;
        CON_Item_Vector = converterItem_Vector;
    }

    public int getCON_Item_ID() {
        return CON_Item_ID;
    }

    public void setCON_Item_ID(int CON_Item_ID) {
        this.CON_Item_ID = CON_Item_ID;
    }

    public String getCON_Item_Vector() {
        return CON_Item_Vector;
    }

    public void setCON_Item_Vector(String CON_Item_Vector) {
        this.CON_Item_Vector = CON_Item_Vector;
    }

    public String getCON_Item_Title() {
        return CON_Item_Title;
    }

    public void setCON_Item_Title(String CON_Item_Title) {
        this.CON_Item_Title = CON_Item_Title;
    }
}
