package com.example.animalbook4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.animalbook4.databinding.FragmentTitleBinding

//フラグメントクラスを継承してTitleFragmentクラスを生成
class TitleFragment : Fragment(){

//    xmlファイルにBindingをつける命名でフラグメントを生成
    private var _binding: FragmentTitleBinding? = null
//    !!は、強制的にnull非許容型にする
    private val binding
      get() = _binding!!

    override fun onCreateView(
//        LayoutInflaterは、指定したxmlのレイアウト(View)リソースを利用できる仕組み
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        bindingクラスからinflateメソッドを使って、viewのインスタンスを作成する
        _binding = FragmentTitleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView(){
        super.onDestroyView()
//        取得したバインディングクラスのインスタンスをonDestroyViewメソッドで破棄する
        _binding = null
    }

    fun setTitle(title: String){
        binding.titleText.text = title
    }
}