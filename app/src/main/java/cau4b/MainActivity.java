package cau4b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.lab4.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private List<DayCap> listLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        listLanguage = new ArrayList<>();
        listLanguage.add(new DayCap(1, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(2, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(3, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(4, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(5, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(6, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(7, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(8, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));

        DayCapAdapter adapter = new DayCapAdapter(this, R.layout.grid_view, listLanguage);
        gridView.setAdapter(adapter);
    }
}