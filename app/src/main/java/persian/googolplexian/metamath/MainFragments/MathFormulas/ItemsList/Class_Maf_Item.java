package persian.googolplexian.metamath.MainFragments.MathFormulas.ItemsList;

public class Class_Maf_Item {

    private int MAF_Item_ID;
    private String MAF_Item_Title;
    private String MAF_Item_Vector;

    public Class_Maf_Item(int MAF_Item_ID, String MAF_Item_Title, String MAF_Item_Vector) {
        this.MAF_Item_ID = MAF_Item_ID;
        this.MAF_Item_Title = MAF_Item_Title;
        this.MAF_Item_Vector = MAF_Item_Vector;
    }

    public int getMAF_Item_ID() {
        return MAF_Item_ID;
    }

    public void setMAF_Item_ID(int MAF_Item_ID) {
        this.MAF_Item_ID = MAF_Item_ID;
    }

    public String getMAF_Item_Title() {
        return MAF_Item_Title;
    }

    public void setMAF_Item_Title(String MAF_Item_Title) {
        this.MAF_Item_Title = MAF_Item_Title;
    }

    public String getMAF_Item_Vector() {
        return MAF_Item_Vector;
    }

    public void setMAF_Item_Vector(String MAF_Item_Vector) {
        this.MAF_Item_Vector = MAF_Item_Vector;
    }
}
