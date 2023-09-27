class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box(){
        this.width= -1;
        this.height= -1;
        this.depth= -1;
    }

    Box(double len) {
        this.width= this.height= this.depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}


public class OverloadCons {
    public static void main(String[] args) throws Exception {
        Box mybox1 = new Box(7, 8, 9);
        Box mybox2 = new Box();
        Box mycube = new Box(5);

        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: "+ vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: "+ vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube is: "+ vol);
    }
}
