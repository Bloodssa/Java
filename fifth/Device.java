package Fifth;

public abstract class Device {

    public abstract String powerOn();

    public abstract String powerOff();
}

class Smartphone extends Device {

    @Override
    public String powerOn() {
       return "Status: Powering ON...";
    }
    @Override
    public String powerOff() {
        return "Status: Powering OFF...";
    }

        // INNERCLASS
        class Battery{
            private int batteryLevel;
            private String batteryHealth;
            private String device;

            
            public Battery(int batteryLevel, String batteryHealth, String device) {
                this.batteryLevel = batteryLevel;
                this.batteryHealth = batteryHealth;
                this.device= device;
            }

            public int getBatteryLevel() {
                return batteryLevel;
            }
            public String getBatteryHealth() {
                return batteryHealth;
            }
            public String getDevice() {
                return device;
            }

            public void showStatus() {
                System.out.println("\nDevice: " + getDevice());
                System.out.println("Status: " + powerOn());

                System.out.println("\n🔋 Battery Status: ");
                System.out.println("- Level: " + getBatteryLevel() + "%");
                System.out.println("- Health: " + getBatteryHealth());

                System.out.println("\n" + powerOff());
            }

    }
}