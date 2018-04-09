package tools.android.com.androidtools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.multi.adapter.BaseRecyclerAdapter;
import com.multi.adapter.BaseRecyclerViewHolder;
import com.multi.adapter.BaseType;
import com.multi.adapter.ViewHolderFactory;

import java.util.ArrayList;
import java.util.List;

public class MultiAdapterActivity extends AppCompatActivity {
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);
        List<BaseType> iTypeList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            StudentInfo studentInfo_one = new StudentInfo("张三", "10", "url");
            iTypeList.add(BaseType.addType(R.layout.item_one, studentInfo_one));

            StudentInfo studentInfo_two = new StudentInfo("张三", "10", "url");
            iTypeList.add(BaseType.addType(R.layout.item_two, studentInfo_two));
        }
        BaseRecyclerAdapter adapter = new BaseRecyclerAdapter(this, iTypeList);
        adapter.createViewHolderFactory(new ViewHolderFactory() {
            @Override
            public BaseRecyclerViewHolder getViewHolder(int viewType, View itemView) {
                BaseRecyclerViewHolder baseRecyclerViewHolder = null;
                switch (viewType) {
                    case R.layout.item_one:
                        baseRecyclerViewHolder = new OneHolder(itemView);
                        break;
                    case R.layout.item_two:
                        baseRecyclerViewHolder = new TwoHolder(itemView);
                        break;
                }
                return baseRecyclerViewHolder;
            }
        });
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }
}
