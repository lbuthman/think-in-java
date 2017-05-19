package src.interfaces;

/**
 * Created by lbuthman on 5/19/17.
 */

////////////////////////////////////////////////
interface Processor {
    String name();
    Object process(Object input);
}
////////////////////////////////////////////////
class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
////////////////////////////////////////////////
class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Waveform " + id;
    }
}
////////////////////////////////////////////////
class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
////////////////////////////////////////////////
class LowPassFilter extends Filter {
    double cutoff;
    public LowPassFilter(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
////////////////////////////////////////////////
class HighPassFilter extends Filter {
    double cutoff;
    public HighPassFilter(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
////////////////////////////////////////////////
class BandPassFilter extends Filter {
    double lowCutoff, highCutoff;
    public BandPassFilter(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
////////////////////////////////////////////////
class FilterAdapter implements Processor {
    Filter filter;
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }
    public String name() {
        return filter.name();
    }
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

public class ProcessorExample {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPassFilter(3.0)), w);
        Apply.process(new FilterAdapter(new HighPassFilter(4.4)), w);
        Apply.process(new FilterAdapter(new BandPassFilter(2.2, 5.7)), w);
    }
}
