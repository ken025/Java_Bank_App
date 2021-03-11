package bankapp;

public interface IBaseRate {
//    since we don't set the rate, we use interface to "extract" that info from an API or DB

    default double getBaseRate(){
        return 2.5;
    }
}
