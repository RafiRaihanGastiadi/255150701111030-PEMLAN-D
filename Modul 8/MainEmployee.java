interface Payable {
    double getPayableAmount();
}

class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }
}

class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public double getTotalInvoice() {
        double total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - getTotalInvoice();
    }
}

public class MainEmployee {
    public static void main(String[] args) {

        Invoice[] invoices = {
            new Invoice("Beras", 2, 50000),
            new Invoice("Minyak", 1, 20000),
            new Invoice("Gula", 3, 15000)
        };

        Employee emp = new Employee(1129808959, "Rafi", 3000000, invoices);

        Payable[] payables = new Payable[invoices.length + 1];

        int i = 0;
        for (Invoice inv : invoices) {
            payables[i++] = inv;
        }
        payables[i] = emp;

        System.out.println("=== DETAIL BELANJA ===");
        for (Invoice inv : invoices) {
            System.out.println("Produk: " + inv.getProductName());
            System.out.println("Jumlah: " + inv.getQuantity());
            System.out.println("Harga/item: " + inv.getPricePerItem());
            System.out.println("Total: " + inv.getPayableAmount());
            System.out.println("----------------------");
        }

        System.out.println("\n=== DATA KARYAWAN ===");
        System.out.println("ID: " + emp.getRegistrationNumber());
        System.out.println("Nama: " + emp.getName());
        System.out.println("Gaji Awal: " + emp.getSalaryPerMonth());
        System.out.println("Total Belanja: " + emp.getTotalInvoice());
        System.out.println("Gaji Setelah Potong: " + emp.getPayableAmount());

        System.out.println("\n=== TOTAL SEMUA PAYABLE ===");
        double total = 0;
        for (Payable p : payables) {
            total += p.getPayableAmount();
        }
        System.out.println("Total semua payable: " + total);
    }
}