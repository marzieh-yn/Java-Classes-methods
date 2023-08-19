package AdvanceJava.Concurrency;

import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
  private boolean isDone;
  private LongAdder totalBytes = new LongAdder();
  private Object totalBytesLock = new Object();
//  private Lock lock = new ReentrantLock();
  private int totalFiles;

  public int getTotalBytes() {
    return totalBytes.intValue();
  }
  public void incrementTotalBytes() {
    totalBytes.increment();
//    lock.lock();
//    try{
//    totalBytes.increment();
//    }
//    finally {
//    lock.unlock();
//    }
  }


  public synchronized void incrementTotalFiles() {
      totalFiles++;
  }

  public int getTotalFiles() {
    return totalFiles;
  }

  public boolean isDone() {
    return isDone;
  }

  public void done() {
    isDone = true;
  }
}
