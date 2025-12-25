package persian.googolplexian.metamath.MainFragments;

import android.content.ClipData;
import android.content.ClipboardManager;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static android.content.Context.CLIPBOARD_SERVICE;

public class Class_ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> FragmentList = new ArrayList<>();
    private final List<String> TitleList = new ArrayList<>();

    public Class_ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return FragmentList.get(position);
    }

    @Override
    public int getCount() {
        return TitleList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

    public void addFragment(Fragment fragment,String title){
        FragmentList.add(fragment);
        TitleList.add(title);
    }

}
