package MAD.Assignment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
class DiaryAdapter(fa: FragmentActivity, private val mNumOfTabs: Int) :
    FragmentStateAdapter(fa) {
    /**
     * Used to get the number of pages
     */
    override fun getItemCount(): Int {
        return mNumOfTabs
    }
    /**
     * Assigning position to fragments
     */
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DiaryDatePage1()
            1 -> DiaryEntryPage2()
            2 -> DiaryLogPage3()
            else -> DiaryDatePage1()
        }
    }
}