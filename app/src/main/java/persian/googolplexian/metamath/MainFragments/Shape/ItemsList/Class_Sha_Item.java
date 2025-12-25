package persian.googolplexian.metamath.MainFragments.Shape.ItemsList;

public class Class_Sha_Item {

    private int SHA_Item_ID;
    private String SHA_Item_Title;
    private String SHA_Item_Vector;

    public Class_Sha_Item(int SHA_Item_ID, String SHA_Item_Title, String SHA_Item_Vector) {
        this.SHA_Item_ID = SHA_Item_ID;
        this.SHA_Item_Title = SHA_Item_Title;
        this.SHA_Item_Vector = SHA_Item_Vector;
    }

    public int getSHA_Item_ID() {
        return SHA_Item_ID;
    }

    public void setSHA_Item_ID(int SHA_Item_ID) {
        this.SHA_Item_ID = SHA_Item_ID;
    }

    public String getSHA_Item_Title() {
        return SHA_Item_Title;
    }

    public void setSHA_Item_Title(String SHA_Item_Title) {
        this.SHA_Item_Title = SHA_Item_Title;
    }

    public String getSHA_Item_Vector() {
        return SHA_Item_Vector;
    }

    public void setSHA_Item_Vector(String SHA_Item_Vector) {
        this.SHA_Item_Vector = SHA_Item_Vector;
    }
}
