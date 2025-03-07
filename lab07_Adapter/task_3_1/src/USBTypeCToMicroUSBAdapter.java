public class USBTypeCToMicroUSBAdapter implements MicroUSB {
    private USBTypeC usbTypeCCharger;

    public USBTypeCToMicroUSBAdapter(USBTypeC usbTypeCCharger) {
        this.usbTypeCCharger = usbTypeCCharger;
    }

    @Override
    public void chargeWithMicroUSB() {
        System.out.println("Адаптація USB Type-C до micro-USB");
        usbTypeCCharger.chargeWithUSBTypeC();
    }
}
