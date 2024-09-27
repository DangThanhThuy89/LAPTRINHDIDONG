package baitap.hello.baitaptinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Tìm điều khiển để tham chiếu đến và thao tác
        EditText dieuKhienA = findViewById(R.id.edta);
        EditText dieukhienB = findViewById(R.id.edtb);

        Button nutTinhTong = findViewById(R.id.button);
        //2. Qui định hàm sẽ được gọi khi người dùng nhấn vào nút tính tổng
            //2.1 Trở ra file xml tìm thuộc tính OnClick của nút bấm, đặt tên
            // ví dụ: OnClick: XuLyTinhTong
            //2.2 Ra khỏi hàm OnCreate để viết hàm XulyTinhTong
    }

    public void XuLyTinhTong(View v) {
        //1. Tìm điều khiển cần thao tác nếu chưa tìm
        EditText dieuKhienA = findViewById(R.id.edta);
        EditText dieuKhienB = findViewById(R.id.edtb);
        TextView tvKetQua = findViewById(R.id.tvKetQua);
        //2.Lấy dữ liệu
        String strSoThuNhat = dieuKhienA.getText().toString();
        String strSoThuHai = dieuKhienB.getText().toString();
        //3. Đưa về kiểu dữ liệu phù hợp (ở đây là dữ liệu số) để tính toán
        double soA = Double.parseDouble(strSoThuNhat);
        double soB = Double.parseDouble(strSoThuHai);
        //4. Tính toán
        double KetQua = soA + soB;
        // Xuất kết quả ra điều khiển tương ứng
        String chuoiThongBao = String.valueOf(KetQua);
        //để settext
        tvKetQua.setText(chuoiThongBao);
    }

}
