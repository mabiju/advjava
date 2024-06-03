package H_Interface;

interface IFather {
    public void Teach();
}

interface IMother {
    public void Feed();
}

class Home {
    public void Shelter() {
        System.out.println("Home is providing shelter.");
    }
}

public class c_interface_noninterface extends Home implements IFather, IMother {
    public static void main(String[] args) {
        c_interface_noninterface obj = new c_interface_noninterface();
        obj.Feed();
        obj.Teach();
        obj.Shelter();
    }

    @Override
    public void Teach() {
        System.out.println("Father is teaching.");
    }

    @Override
    public void Feed() {
        System.out.println("Mother is feeding.");
    }
}
