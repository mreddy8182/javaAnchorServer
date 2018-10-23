package me.kroeker.alex.anchor.jserver.model;

import java.util.Collection;
import java.util.Objects;

/**
 * @author ak902764
 */
public class FrameSummary {

    private String frame_id;
    private int row_count;
    private Collection<ColumnSummary<?>> column_summary_list;

    public String getFrame_id() {
        return frame_id;
    }

    public void setFrame_id(String frame_id) {
        this.frame_id = frame_id;
    }

    public int getRow_count() {
        return row_count;
    }

    public void setRow_count(int row_count) {
        this.row_count = row_count;
    }

    public Collection<ColumnSummary<?>> getColumn_summary_list() {
        return column_summary_list;
    }

    public void setColumn_summary_list(Collection<ColumnSummary<?>> column_summary_list) {
        this.column_summary_list = column_summary_list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrameSummary that = (FrameSummary) o;
        return row_count == that.row_count &&
                Objects.equals(frame_id, that.frame_id) &&
                Objects.equals(column_summary_list, that.column_summary_list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frame_id, row_count, column_summary_list);
    }

    @Override
    public String toString() {
        return "FrameSummary{" +
                "frame_id='" + frame_id + '\'' +
                ", row_count=" + row_count +
                ", column_summary_list=" + column_summary_list +
                '}';
    }
}
