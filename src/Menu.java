import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------------------------------");
            System.out.println("🌟 Bienvenido a la Tienda de Dispositivos Electrónicos 🌟");
            System.out.println("----------------------------------------------------------");
            System.out.println("📱 Por favor, seleccione el tipo de dispositivo que desea comprar 📱");
            System.out.println("1️⃣ 1. 🖥️ Desktop");
            System.out.println("2️⃣ 2. 📱 Smartphone");
            System.out.println("3️⃣ 3. 📱 Tablet");
            System.out.println("4️⃣ 4. ❄️ Refrigerador");
            System.out.println("5️⃣ 5. 💻 Laptop");
            System.out.println("6️⃣ 6. 🖥️ Desktop Computadora");
            System.out.println("7️⃣ 7. 🚪 Salir");

            System.out.print("➡️ Por favor, ingrese su opción aquí: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            DispositivoElectronico dispositivo = null;

            switch (opcion) {
                case 1:
                    dispositivo = new Desktop("Racom", "OptiPlex", 700.00, "Intel i5, 8GB RAM, 1TB HDD");
                    break;
                case 2:
                    dispositivo = new Smartphone("Tigo", "XPhone", 999.00, "iOS", 3095);
                    break;
                case 3:
                    dispositivo = new Tablet("Claro", "Galaxy Tab S7", 650.00, "Android", 8000);
                    break;
                case 4:
                    dispositivo = new Refrigerador("Mabe", "InstaView", 1200.00, 600, "Eléctrica");
                    break;
                case 5:
                    dispositivo = new Laptop("Tecnol", "Pavilion", 850.00, "Intel i7", 16);
                    break;
                case 6:
                    dispositivo = new DesktopComputadora("GTC", "ThinkCentre", 650.00, "AMD Ryzen 5", 8);
                    break;
                case 7:
                    System.out.println("🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒");
                    System.out.println("👋 Gracias por visitar nuestra tienda. ¡Hasta luego! 👋");
                    System.out.println("🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Opción no válida. Por favor, intente de nuevo. ❌");
                    continue;
            }

            System.out.println("\n🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒");
            System.out.println("📋 Detalles del dispositivo seleccionado 📋");
            System.out.println(dispositivo);
            System.out.println("🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒🛒\n");
        }
    }
}
