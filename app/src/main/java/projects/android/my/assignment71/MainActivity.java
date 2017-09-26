package projects.android.my.assignment71;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView searchText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find reference to search Text
        searchText = (TextView) findViewById(R.id.searchText);
    }

    public void searchData(View view)
    {
        Intent searchIntent = new Intent(Intent.ACTION_WEB_SEARCH);
        //Get the search Query
        String query = searchText.getText().toString();
        searchIntent.putExtra(SearchManager.QUERY,query);
        startActivity(searchIntent);
    }
}
