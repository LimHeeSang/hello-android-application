package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class FragmentOne:Fragment(){

    interface onDataPassListener{
        fun onDataPass(data: String?)
    }
    lateinit var dataPassListener : onDataPassListener


    override fun onAttach(context: Context) {
        Log.d("life_cycle", "F onAttach")
        super.onAttach(context)
        dataPassListener = context as onDataPassListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle", "F onCreateView")
        // 프라그먼트가 인터페이스를 처음으로 그릴때 호출된다.
        // inflater: 뷰를 그려주는 역할
        // container: 부모뷰
        return inflater.inflate(R.layout.fragment_one, container, false)
        //return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Activity의 OnCreate에서 했던 작업을 여기에서 한다
        //val pass : Button = findViewById(R.id.pass)     //xml요소에 접근하는 함수인 findViewById 함수가 Fragment클래스에서 쓰면 에러발생.. 해결방법 찾아야함(나중에 필요하면 찾자)
        /*pass.setOnClickListener {
            dataPassListener.onDataPass("Good Bye")
        }*/
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onActivityCreated")

        val data = arguments?.getString("hello")
        Log.d("data", ""+data)

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle", "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle", "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle", "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle", "F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle", "F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle", "F onDetach")
        super.onDetach()
    }
}
