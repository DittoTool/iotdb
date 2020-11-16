package org.apache.iotdb.db.index.common;

import java.nio.ByteBuffer;
import java.util.Map;
import org.apache.iotdb.db.index.read.IndexFileResource;

/**
 *
 */
public enum IndexMessageType {
  STORAGE_GROUP_LOADED,
  NEW_ORDERED_DATA_POINT,
  NEW_OUT_OF_ORDERED_DATA_POINT,
//  MEM_DATA_FLUSHED,//
  TSFILE_CLOSED,
  MERGE_FINISHED;

}
