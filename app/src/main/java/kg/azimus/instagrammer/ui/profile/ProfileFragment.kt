package kg.azimus.instagrammer.ui.profile

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kg.azimus.instagrammer.R
import kg.azimus.instagrammer.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_profile
    }

    override fun onViewReady(view: View) {
        (activity as AppCompatActivity?)!!.setSupportActionBar(toolbar)
    }
}