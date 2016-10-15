# 一：简述

使用android自带的Movie类实现的播放Gif动画，apidemo里有，此代码来自apidemo，大概有不到20行代码，后又扩展出很多功能，参考了网上其他人的例子，基本都是星星点点功能，我集众家之所长又整理了一下，目前主要增加了暂停继续功能，同时可以任意移动时间节点，我看到网上有些自定义的不是很好，暂停后设置时间后不刷新界面，还解决了一些其他问题。总之这个Movie类还是有很多坑的，稍不注意就看不到效果。

技术交流 QQ:1264957104

![image](https://github.com/hnsugar/GifView/blob/master/1.gif)



被注释代码是测试手动设置播放某一帧的，只要设置了资源文件默认就会播放，没有定义额外的属性，毕竟多一个文件嘛，我很懒的，仅供学习。

    public class MainActivity extends AppCompatActivity {
        private GifView mGifView;
//    private int time, time2;
//    private TimerTask mTimerTask = new TimerTask() {
//        @Override
//        public void run() {
//            mHandler.sendEmptyMessage(1);
//        }
//    };
//    private Handler mHandler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            time += time2;
//            if (time>=mGifView.getMovie().duration()){
//                time=0;
//            }
//            System.out.println(time);
//            mGifView.setMovieTime(time);
//
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGifView = (GifView) findViewById(R.id.gif);
        mGifView.setMovieResource(R.raw.test);
//        mGifView.setPaused(true);
//        time2 = mGifView.getMovie().duration() / 15;
//        Timer mTimer = new Timer(true);
//        mTimer.schedule(mTimerTask, 1000, 1000);
     }
    }


