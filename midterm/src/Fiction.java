public class Fiction extends Book implements iBorrowable{

    public Fiction(String title, double price, String publishYear){
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle() + " all events are imaginary and not based on real facts";
    }

    private int borDay;
    private int retDay;

    @Override
    public void setBorrowDate(int day) {

    }

    @Override
    public void setReturnDate(int day) {

    }

    @Override
    public boolean isAvailable(int day) {
        if(borDay <= day && day <= retDay) {
            return false;
        }else{
            return true;
        }
    }
}
