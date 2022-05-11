package src.Lesson5;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor

public class AppData {

    private String[] header;
    private Integer[][] data;

    public void setHeader(String[] split) {
    }

    public void setData(Integer[][] toArray) {
    }

    public String[] getHeader() {
        return new String[0];
    }

    public boolean[][] getData() {
        return new boolean[0][];
    }
}