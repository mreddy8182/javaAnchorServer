package me.kroeker.alex.anchor.jserver.model;

import java.util.Objects;

/**
 * @author ak902764
 */
public class AnchorRuleMetric extends AnchorRule {

    private static final String COLUMN_TYPE = "metric";

    private double conditionMin;

    private double conditionMax;

    public AnchorRuleMetric() {
        super(COLUMN_TYPE);
    }

    public AnchorRuleMetric(String featureName, double conditionMin, double conditionMax, double precision, double coverage) {
        super(COLUMN_TYPE, featureName, precision, coverage);
        this.conditionMin = conditionMin;
        this.conditionMax = conditionMax;
    }

    public double getConditionMin() {
        return conditionMin;
    }

    public double getConditionMax() {
        return conditionMax;
    }

    public void setConditionMin(double conditionMin) {
        this.conditionMin = conditionMin;
    }

    public void setConditionMax(double conditionMax) {
        this.conditionMax = conditionMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AnchorRuleMetric that = (AnchorRuleMetric) o;
        return Double.compare(that.conditionMin, conditionMin) == 0 &&
                Double.compare(that.conditionMax, conditionMax) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), conditionMin, conditionMax);
    }

    @Override
    public String toString() {
        return "AnchorRuleMetric{" +
                "conditionMin=" + conditionMin +
                ", conditionMax=" + conditionMax +
                "} " + super.toString();
    }
}
