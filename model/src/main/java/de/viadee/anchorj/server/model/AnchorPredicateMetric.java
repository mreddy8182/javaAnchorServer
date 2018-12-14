package de.viadee.anchorj.server.model;

import java.util.Objects;

/**
 * @author ak902764
 */
public class AnchorPredicateMetric extends AnchorPredicate {
    private static final long serialVersionUID = -3335262707734997357L;

    private static final String COLUMN_TYPE = "metric";

    private double conditionMin;

    private double conditionMax;

    public AnchorPredicateMetric() {
        super(COLUMN_TYPE);
    }

    public AnchorPredicateMetric(String featureName, Integer discretizedValue, double addedPrecision,
                                 double addedCoverage, double conditionMin, double conditionMax) {
        super(COLUMN_TYPE, featureName, discretizedValue, addedPrecision, addedCoverage);
        this.conditionMin = conditionMin;
        this.conditionMax = conditionMax;
    }

    public AnchorPredicateMetric(String featureName, Integer discretizedValue, double addedPrecision, double addedCoverage, double exactCoverage, double conditionMin, double conditionMax) {
        super(COLUMN_TYPE, featureName, discretizedValue, addedPrecision, addedCoverage, exactCoverage);
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
        AnchorPredicateMetric that = (AnchorPredicateMetric) o;
        return Double.compare(that.conditionMin, conditionMin) == 0 &&
                Double.compare(that.conditionMax, conditionMax) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), conditionMin, conditionMax);
    }

    @Override
    public String toString() {
        return "AnchorPredicateMetric{" +
                "conditionMin=" + conditionMin +
                ", conditionMax=" + conditionMax +
                "} " + super.toString();
    }
}
