package xyz.azmitia.act4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Libro2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Libro2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Libro2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Libro2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Libro2Fragment newInstance(String param1, String param2) {
        Libro2Fragment fragment = new Libro2Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_libro2, container, false);;
        WebView webView = (WebView) v.findViewById(R.id.webView2);
        webView.getSettings().setJavaScriptEnabled(true); //Permitir JavaScript
        webView.setWebViewClient(new WebViewClient()); //abrir una url en la app
        webView.loadUrl("https://www.amazon.com.mx/Percy-Jackson-los-dioses-Olimpo/dp/8498386268/ref=sr_1_2?dchild=1&keywords=percy+jackson&qid=1631503323&s=books&sr=1-2");

        return v;
    }
}