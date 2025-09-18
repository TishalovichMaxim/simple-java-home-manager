package by.tishalovichm.sjhm;

public class App {

    public static void main(String[] args) {
        var service = new Service();
        var view = new View();

        if (args.length == 0) {
            return;
        }

        String command = args[0];

        switch (command) {
            case "ls" -> {
                view.showJdksList(service.listAllJdks());
            }
            case "set" -> {
                if (args.length != 2) {
                    return;
                }
                int index = Integer.parseInt(args[1]);
                service.setActiveJdk(index);
            }
        }
    }

}
