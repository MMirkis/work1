package servicesRealizebl;

public class CalculateService {
    private TO to;
    private Washing washing;
    private Refill refill;

    public CalculateService(TO to, Washing washing, Refill refill) {
        this.to = to;
        this.washing = washing;
        this.refill = refill;
    }

    public TO getTo(){
        return to;
    }

    public Refill getRefill() {
        return refill;
    }

    public Washing getWashing() {
        return washing;
    }
}
