package me.kroeker.alex.anchor.jserver.model;

import java.util.Objects;

/**
 */
public class Model {
    private String model_id;
    private String name;
    private String url;
    private String target_column;
    private DataFrame data_frame;

    public String getModel_id() {
        return model_id;
    }

    public void setModel_id(String model_id) {
        this.model_id = model_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTarget_column() {
        return target_column;
    }

    public void setTarget_column(String target_column) {
        this.target_column = target_column;
    }

    public DataFrame getData_frame() {
        return data_frame;
    }

    public void setData_frame(DataFrame data_frame) {
        this.data_frame = data_frame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(model_id, model.model_id) &&
                Objects.equals(name, model.name) &&
                Objects.equals(url, model.url) &&
                Objects.equals(target_column, model.target_column) &&
                Objects.equals(data_frame, model.data_frame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model_id, name, url, target_column, data_frame);
    }

    @Override
    public String toString() {
        return "Model{" +
                "model_id='" + model_id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", target_column='" + target_column + '\'' +
                ", data_frame=" + data_frame +
                '}';
    }
}
