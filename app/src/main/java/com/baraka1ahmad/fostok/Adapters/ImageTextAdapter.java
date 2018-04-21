package com.baraka1ahmad.fostok.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.baraka1ahmad.fostok.MainActivity;
import com.baraka1ahmad.fostok.Models.CardItem;
import com.baraka1ahmad.fostok.R;

import java.util.List;

/**
 * Created by Ah on 2018-04-20.
 */

public class ImageTextAdapter extends BaseAdapter {
    private static LayoutInflater inflater=null;
    List<CardItem> data;
//    TextView title, text ;
//    ImageView img;
    int myid;
    int txt1;
    int txt2;
    int img;
    Context context;

    public ImageTextAdapter( List<CardItem> data, Context context,int myid,int img,int txt1,int txt2){
    this.data = data;
    this.myid = myid;
    this.txt1=txt1;
        this.txt2=txt2;
        this.img=img;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vi=view;
        if(view==null)
            vi = inflater.inflate(myid, null);

        TextView title = (TextView)vi.findViewById(txt1); // title
        TextView artist = (TextView)vi.findViewById(txt2); // artist name
        ImageView thumb_image=(ImageView)vi.findViewById(img); // thumb image

//        HashMap&lt;String, String&gt; song = new HashMap&lt;String, String&gt;();
//        song = data.get(position);

        // Setting all values in listview
        title.setText(data.get(i).getTitle());
        artist.setText(data.get(i).getText());
        thumb_image.setImageResource(data.get(i).getImge());
        return vi;
    }
}
