package it.brian.school.cli.oop.hdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<HardDisk> hardDisks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.printf("HARD DISK %d:%n", i + 1);
            hardDisks.add(inputHardDisk());
        }

        System.out.println("OUTPUT:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("\nHARD DISK %d:%n", i + 1);
            System.out.println(hardDisks.get(i));
        }

    }

    private static HardDisk inputHardDisk() {
        HardDisk hardDisk = new HardDisk();
        System.out.print("  Enter brand: ");
        hardDisk.setBrand(scanner.next());
        System.out.print("  Enter rpm: ");
        hardDisk.setRpm(scanner.nextInt());
        System.out.print("  Enter access time: ");
        hardDisk.setAccessTime(scanner.nextInt());
        System.out.print("  Enter capacity: ");
        hardDisk.setCapacity(scanner.nextInt());
        System.out.println();
        return hardDisk;
    }
}
