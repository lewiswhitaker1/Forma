public class Forma
{
    private FormaWindow formaWindow;
    private FormaPanel formaPanel;
    public Forma()
    {
        formaPanel = new FormaPanel();
        formaWindow = new FormaWindow(formaPanel);
    }
}
