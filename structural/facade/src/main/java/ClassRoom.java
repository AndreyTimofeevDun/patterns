public class ClassRoom {
    private boolean open = false;

    public ClassRoom(){}

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void getClassState(){
        if (this.open) System.out.println("Class is ready");
        else System.out.println("Class is not ready");
    }
}
