package de.viadee.anchorj.server.model;

import java.util.Objects;

/**
 *
 */
public class AnchorPredicateEnum extends AnchorPredicate {
    private static final long serialVersionUID = -5264028186945224368L;

    private static final String COLUMN_TYPE = "string";

    private String category;

    public AnchorPredicateEnum() {
        super(COLUMN_TYPE);
    }

    public AnchorPredicateEnum(String featureName, Integer discretizedValue, String category, double precision, double coverage) {
        super(COLUMN_TYPE, featureName, discretizedValue, precision, coverage);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AnchorPredicateEnum that = (AnchorPredicateEnum) o;
        return Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }

    @Override
    public String toString() {
        return "AnchorPredicateEnum{" +
                "category='" + category + '\'' +
                "} " + super.toString();
    }
}
